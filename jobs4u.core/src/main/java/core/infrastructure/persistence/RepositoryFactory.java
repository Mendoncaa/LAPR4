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
package core.infrastructure.persistence;

import core.management.InterviewModel.domain.InterviewModel;
import core.management.InterviewModel.repository.InterviewModelRepository;
import core.management.RequirementSpecification.domain.RequirementSpecification;
import core.management.RequirementSpecification.repository.RequirementSpecificationRepository;
import core.management.candidate.repository.CandidateRepository;
import core.management.costumer.repository.CustomerRepository;
import core.management.costumer.repository.CustomerRepresentativeRepository;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.rank.repository.RankRepository;
import core.utentemanagement.repositories.UtenteRepository;
import core.utentemanagement.repositories.SignupRequestRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

/**
 * @author Paulo Gandra Sousa
 *
 */
public interface RepositoryFactory {

    /**
     * factory method to create a transactional context to use in the repositories
     *
     * @return
     */
    TransactionalContext newTransactionalContext();

    /**
     *
     * @param autoTx
     *            the transactional context to enrol
     * @return
     */
    UserRepository users(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    UserRepository users();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    UtenteRepository utentes(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    UtenteRepository utentes();

     /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    SignupRequestRepository signupRequests(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    SignupRequestRepository signupRequests();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    JobOpeningRepository jobOpenings(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    JobOpeningRepository jobOpenings();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    CustomerRepository customer(TransactionalContext autoTx);


    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    CustomerRepository customer();

    CustomerRepresentativeRepository customerRepresentative();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    CandidateRepository candidate(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    CandidateRepository candidate();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    ApplicationRepository application(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    ApplicationRepository application();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    InterviewModelRepository interviewModel(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    InterviewModelRepository interviewModel();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    RequirementSpecificationRepository requirementSpecification(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    RequirementSpecificationRepository requirementSpecification();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    RankRepository rank(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    RankRepository rank();
}