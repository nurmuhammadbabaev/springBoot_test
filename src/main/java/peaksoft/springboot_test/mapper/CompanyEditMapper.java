package peaksoft.springboot_test.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springboot_test.dto.CompanyRequest;
import peaksoft.springboot_test.entity.Company;

@Component
public class CompanyEditMapper {

    public Company create(CompanyRequest companyRequest){
        if (companyRequest==null){
            return null;
        }
        Company company=new Company();

        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setNumber(companyRequest.getNumber());
        company.setEmail(companyRequest.getEmail());

        return company;
    }
    public void update(Company company,CompanyRequest companyRequest){

        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setNumber(companyRequest.getNumber());
        company.setEmail(companyRequest.getEmail());


    }

}
