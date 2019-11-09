package com.espelita.lab5espelitamorris;

public class Companies {
    private String companyName,companyCountry,companyCEO,companyIndustry, companyDescription;
    private int logo;

    public Companies(int logo, String companyName, String companyCountry, String companyCEO, String companyIndustry, String companyDescription){
        this.logo = logo;
        this.companyName = companyName;
        this.companyCountry = companyCountry;
        this.companyCEO = companyCEO;
        this.companyIndustry = companyIndustry;
        this.companyDescription = companyDescription;
    }

    public int getLogo() {return logo;}
    public String getCompanyName() {return companyName;}
    public String getCompanyCountry() {return companyCountry;}
    public String getCompanyCEO() {return companyCEO;}
    public String getCompanyIndustry() {return  companyIndustry;}
    public String getCompanyDescription() {return companyDescription;}
}
