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


import core.management.costumer.domain.CustomerRepresentative;
import core.management.costumer.domain.PhoneNumber;
import core.management.costumer.repository.CustomerRepresentativeRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import jobs4u.Application;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
class JpaCustomerRepresentativeRepository extends JpaAutoTxRepository<CustomerRepresentative, PhoneNumber, PhoneNumber>
		implements CustomerRepresentativeRepository {

	public JpaCustomerRepresentativeRepository(final TransactionalContext autoTx) {
		super(autoTx, "username");
	}

	public JpaCustomerRepresentativeRepository(final String puname) {
		super(puname, Application.settings().getExtendedPersistenceProperties(), "username");
	}

	@Override
    public Optional<CustomerRepresentative> findByUsername(final Username name) {
        final Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        return matchOne("e.systemUser.username=:name", params);
    }

	@Override
    public Optional<CustomerRepresentative> findByPhoneNumber(final PhoneNumber number) {
        final Map<String, Object> params = new HashMap<>();
        params.put("number", number);
        return matchOne("e.phoneNumber=:number", params);
    }

    @Override
    public Iterable<CustomerRepresentative> findAllActive() {
        return match("e.systemUser.active = true");
    }

	

}