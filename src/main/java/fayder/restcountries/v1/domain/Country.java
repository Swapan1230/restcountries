/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fayder.restcountries.v1.domain;

import java.util.List;

import fayder.restcountries.domain.BaseCountry;
import org.codehaus.jackson.annotate.JsonProperty;

public class Country extends BaseCountry {

    private List<String> currencies;
    private List<String> languages;
    private CountryTranslations translations;
    private String relevance;

    public List<String> getCurrencies() {
        return currencies;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public CountryTranslations getTranslations() {
        return translations;
    }

    public String getRelevance() {
        return relevance;
    }
}
