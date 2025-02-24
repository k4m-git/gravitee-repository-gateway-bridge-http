/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.repository.bridge.client.management;

import io.gravitee.repository.exceptions.TechnicalException;
import io.gravitee.repository.management.api.PageRepository;
import io.gravitee.repository.management.api.search.PageCriteria;
import io.gravitee.repository.management.model.Page;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
@Component
public class HttpPageRepository extends AbstractRepository implements PageRepository {

    @Override
    public Optional<Page> findById(String s) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public Page create(Page item) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public Page update(Page item) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public void delete(String s) throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public Integer findMaxApiPageOrderByApiId(String apiId) throws TechnicalException {
        throw new IllegalStateException();
    }


    @Override
    public Integer findMaxPortalPageOrder() throws TechnicalException {
        throw new IllegalStateException();
    }

    @Override
    public List<Page> search(PageCriteria pageCriteria) throws TechnicalException {
        throw new IllegalStateException();
    }
}
