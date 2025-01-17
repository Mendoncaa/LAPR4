/*
 * Copyright (c) 2013-2024 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package jobs4u.persistence.impl.inmemory;

import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.domain.JobState;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.rank.domain.Rank;
import core.utentemanagement.domain.MecanographicNumber;
import core.utentemanagement.domain.Utente;
import core.utentemanagement.repositories.UtenteRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.*;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
public class InMemoryJobOpeningRepository
        extends InMemoryDomainRepository<JobOpening, JobReference>
        implements JobOpeningRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public List<JobOpening> findAllByState(JobState jobState) {
        return (List<JobOpening>) match(e -> e.getJobState().equals(jobState));
    }

    @Override
    public Optional<JobOpening> findByJobReference(final JobReference number) {
        return matchOne(e -> e.identity().equals(number));
    }

    @Override
    public int nextJobNumber(String customerCode) {
        List<JobOpening> list = (List<JobOpening>) match(e -> e.getJobReference().getCustomerCode().equals(customerCode));
        return list.size() + 1;
    }

    @Override
    public List<JobReference> findAllJobReferences() {
        List<JobReference> list = new ArrayList<>();
        for(JobOpening jb : findAll()){
            list.add(jb.getJobReference());
        }
        return list;
    }

    @Override
    public Rank findRankByJobReference(JobReference jobReference) {
        return findByJobReference(jobReference).get().getRank();
    }

    @Override
    public String getInterviewFilePath(JobReference jobReference) {
        return findByJobReference(jobReference).get().getInterviewModel().getTemplatePath();
    }

    @Override
    public String getRequirementFilePath(JobReference jobReference) {
        return findByJobReference(jobReference).get().getRequirementsSpecification().getTemplatePath();
    }
}
