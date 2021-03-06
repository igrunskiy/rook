/*
 * Copyright 2013 Stanley Shyiko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shyiko.rook.target.hibernate4.fulltextindex;

import org.hibernate.search.indexes.interceptor.EntityIndexingInterceptor;

import java.util.Collection;

/**
 * @author <a href="mailto:stanley.shyiko@gmail.com">Stanley Shyiko</a>
 */
public class IndexingDirective {

    private final PrimaryKey primaryKey;
    private final boolean suppressSelfIndexing;
    private final EntityIndexingInterceptor entityIndexingInterceptor;
    private final Collection<Reference> containerReferences;

    public IndexingDirective(PrimaryKey primaryKey, boolean suppressSelfIndexing,
            EntityIndexingInterceptor entityIndexingInterceptor, Collection<Reference> containerReferences) {
        this.primaryKey = primaryKey;
        this.suppressSelfIndexing = suppressSelfIndexing;
        this.entityIndexingInterceptor = entityIndexingInterceptor;
        this.containerReferences = containerReferences;
    }

    public PrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    public boolean isSuppressSelfIndexing() {
        return suppressSelfIndexing;
    }

    public EntityIndexingInterceptor getEntityIndexingInterceptor() {
        return entityIndexingInterceptor;
    }

    public Collection<Reference> getContainerReferences() {
        return containerReferences;
    }

}
