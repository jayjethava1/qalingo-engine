/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.pojo.tax;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TaxPojo {

	private Long id;
	private int version;
	private String name;
	private String description;
	private String code;
	private BigDecimal percent;
    private TaxTypePojo taxType;
	private Set<TaxCountryPojo> taxCountries = new HashSet<TaxCountryPojo>(); 
	private Long marketAreaId;
	private Date dateCreate;
	private Date dateUpdate;
	
	public TaxPojo() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getPercent() {
		return percent;
	}
	
	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}
	
	public TaxTypePojo getTaxType() {
        return taxType;
    }
	
	public void setTaxType(TaxTypePojo taxType) {
        this.taxType = taxType;
    }
	
	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public Set<TaxCountryPojo> getTaxCountries() {
		return taxCountries;
	}

	public void setTaxeCountries(Set<TaxCountryPojo> taxCountries) {
		this.taxCountries = taxCountries;
	}
	
	public Long getMarketAreaId() {
		return marketAreaId;
	}
	
	public void setMarketAreaId(Long marketAreaId) {
		this.marketAreaId = marketAreaId;
	}

}