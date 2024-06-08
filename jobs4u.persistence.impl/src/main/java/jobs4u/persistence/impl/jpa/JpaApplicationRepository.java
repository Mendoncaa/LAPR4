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

import core.management.candidate.domain.Candidate;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import jobs4u.Application;

import java.util.*;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
class JpaApplicationRepository extends JpaAutoTxRepository<jobApplication, Long, Long>
		implements ApplicationRepository {

	public JpaApplicationRepository(final TransactionalContext autoTx) {
		super(autoTx, "username");
	}

	public JpaApplicationRepository(final String puname) {
		super(puname, Application.settings().getExtendedPersistenceProperties(), "username");
	}

	@Override
	public List<jobApplication> findAllByStatus(String status) {
		final Map<String, Object> params = new HashMap<>();
		params.put("status", status);
		return (List<jobApplication>) match("e.status=:status", params);
	}

	@Override
	public List<jobApplication> findApplicationsByJobOpening(final JobOpening jobOpening) {
		final Map<String, Object> params = new HashMap<>();
		params.put("jobOpening", jobOpening);
		return (List<jobApplication>) match("e.jobOpening=:jobOpening", params);
	}

	@Override
	public List<jobApplication> findApplicationsByCandidate(final Candidate candidate) {
		final Map<String, Object> params = new HashMap<>();
		params.put("candidate", candidate);
		return (List<jobApplication>) match("e.candidate=:candidate", params);
	}

	@Override
	public Optional<List<jobApplication>> findbyJobReference(JobReference jobReference) {
		return Optional.empty();
	}

	@Override
	public List<Candidate> findCandidatesByJobOpening(JobOpening jobOpening) {
		List<jobApplication> applications = findApplicationsByJobOpening(jobOpening);
		List<Candidate> candidates = new ArrayList<>();
		for (jobApplication application : applications) {
			boolean exists = false;
			for (Candidate candidate : candidates) {
				if(candidate.equals(application.getCandidate())) {
					exists = true;
					break;
				}
			}
			if(!exists) {
				candidates.add(application.getCandidate());
			}
		}
		return candidates;
	}

	@Override
	public int countApplicationsByJobReference(JobReference jobReference) {
		return 0;
	}

	@Override
	public int countScreeningByJobReference(JobReference jobReference) {
		return 0;
	}

	@Override
	public int countInterviewsByJobReference(JobReference jobReference) {
		return 0;
	}

	@Override
	public int countResultsByJobReference(JobReference jobReference) {
		return 0;
	}
}