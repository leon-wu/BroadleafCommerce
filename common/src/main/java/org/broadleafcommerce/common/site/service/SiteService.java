/*
 * #%L
 * BroadleafCommerce Common Libraries
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.common.site.service;

import org.broadleafcommerce.common.site.dao.SiteDao;
import org.broadleafcommerce.common.site.dao.SiteDaoImpl;
import org.broadleafcommerce.common.site.domain.Catalog;
import org.broadleafcommerce.common.site.domain.Site;

import java.util.List;

public interface SiteService {

    /**
     * Creates an instance of Site.   Default implementation delegates to {@link SiteDao#create()}.
     * 
     * @return
     */
    public Site createSite();

    /**
     * Find a site by its id.
     * @param id
     * @return
     */
    public Site retrieveSiteById(Long id);

    /**
     * Find a site by its domain
     * @param id
     * @return
     */
    public Site retrieveSiteByDomainName(String domain);

    /**
     * Save updates to a site.
     * @param id
     * @return
     */
    public Site save(Site site);

    /**
     * Returns the default site.  
     * 
     * @see {@link SiteDaoImpl}
     * 
     * @param id
     * @return
     */
    public Site retrieveDefaultSite();

    /**
     * @return a List of all sites in the system
     */
    public List<Site> findAllActiveSites();

    /**
     * Finds a catalog by its id.
     * 
     * @param id
     * @return the catalog
     */
    public Catalog findCatalogById(Long id);

}
