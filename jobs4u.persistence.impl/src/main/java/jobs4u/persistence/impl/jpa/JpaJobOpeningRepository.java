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
package jobs4u.persistence.impl.jpa;

import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.domain.JobState;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.rank.domain.Rank;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import jobs4u.Application;

import java.util.*;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
class JpaJobOpeningRepository extends JpaAutoTxRepository<JobOpening, JobReference, JobReference>
		implements JobOpeningRepository {

	public JpaJobOpeningRepository(final TransactionalContext autoTx) {
		super(autoTx, "username");
	}

	public JpaJobOpeningRepository(final String puname) {
		super(puname, Application.settings().getExtendedPersistenceProperties(), "username");
	}

	@Override
	public List<JobOpening> findAllByState(JobState jobState) {
		final Map<String, Object> params = new HashMap<>();
		params.put("jobState", jobState);
		return match("e.jobState=:jobState", params);
	}

	@Override
	public Optional<JobOpening> findByJobReference(final JobReference number) {
		final Map<String, Object> params = new HashMap<>();
		params.put("number", number);
		return matchOne("e.jobReference=:number", params);
	}

	@Override
	public int nextJobNumber(String customerCode) {
		int count = 1;
		List<JobOpening> list = createQuery("SELECT e FROM JobOpening e", JobOpening.class).getResultList();
		for(JobOpening job : list) {
			if(job.getJobReference().getCustomerCode().equals(customerCode)) {
				count++;
			}
		}
		return count;
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
		JobOpening job = findByJobReference(jobReference).get();
		return job.getRank();
	}

	@Override
	public String getInterviewFilePath(JobReference jobReference) {
		JobOpening job = findByJobReference(jobReference).get();
		return job.getInterviewModel().getTemplatePath();
	}

	@Override
	public String getRequirementFilePath(JobReference jobReference) {
		JobOpening job = findByJobReference(jobReference).get();
		return job.getRequirementsSpecification().getTemplatePath();
	}
}