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

import core.management.InterviewModel.repository.InterviewModelRepository;
import core.management.RequirementSpecification.repository.RequirementSpecificationRepository;
import core.management.candidate.repository.CandidateRepository;
import core.management.costumer.repository.CustomerRepository;
import core.management.costumer.repository.CustomerRepresentativeRepository;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.rank.repository.RankRepository;
import jobs4u.infrastructure.bootstrapers.ExemploBootstrapper;
import core.infrastructure.persistence.RepositoryFactory;
import core.utentemanagement.repositories.UtenteRepository;
import core.utentemanagement.repositories.SignupRequestRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.inmemory.InMemoryUserRepository;

/**
 *
 * Created by nuno on 20/03/16.
 */
public class InMemoryRepositoryFactory implements RepositoryFactory {

    static {
        // only needed because of the in memory persistence
        new ExemploBootstrapper().execute();
    }

    @Override
    public UserRepository users(final TransactionalContext tx) {
        return new InMemoryUserRepository();
    }

    @Override
    public UserRepository users() {
        return users(null);
    }

    @Override
    public UtenteRepository utentes(final TransactionalContext tx) {

        return new InMemoryUtenteRepository();
    }

    @Override
    public UtenteRepository utentes() {
        return utentes(null);
    }

    @Override
    public SignupRequestRepository signupRequests() {
        return signupRequests(null);
    }

    @Override
    public SignupRequestRepository signupRequests(final TransactionalContext tx) {
        return new InMemorySignupRequestRepository();
    }

    @Override
    public JobOpeningRepository jobOpenings(TransactionalContext autoTx) {
        return null;
    }

    @Override
    public JobOpeningRepository jobOpenings() {
        return null;
    }

    @Override
    public CustomerRepository customer(TransactionalContext autoTx) {
        return null;
    }

    @Override
    public CustomerRepresentativeRepository customerRepresentative() {
        return null;
    }

    @Override
    public CustomerRepository customer() {
        return null;
    }



    @Override
    public CandidateRepository candidate(TransactionalContext autoTx) {
        return null;
    }

    @Override
    public CandidateRepository candidate() {
        return null;
    }

    @Override
    public ApplicationRepository application(TransactionalContext autoTx) {
        return null;
    }

    @Override
    public ApplicationRepository application() {
        return null;
    }

    @Override
    public InterviewModelRepository interviewModel(TransactionalContext autoTx) {
        return null;
    }

    @Override
    public InterviewModelRepository interviewModel() {
        return null;
    }

    @Override
    public RequirementSpecificationRepository requirementSpecification(TransactionalContext autoTx) {
        return null;
    }

    @Override
    public RequirementSpecificationRepository requirementSpecification() {
        return null;
    }

    @Override
    public RankRepository rank(TransactionalContext autoTx) {
        return null;
    }

    @Override
    public RankRepository rank() {
        return null;
    }

    @Override
    public TransactionalContext newTransactionalContext() {
        // in memory does not support transactions...
        return null;
    }

}
