package peaksoft.springboot_test.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springboot_test.dto.CompanyResponse;
import peaksoft.springboot_test.entity.Company;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyViewMapper {

    public CompanyResponse viewCompany(Company company) {

        if (company == null) {
            return null;
        }
        CompanyResponse response = new CompanyResponse();
        if (company.getId() != null) {
            response.setId(String.valueOf(company.getId()));
        }

        response.setCompanyName(company.getCompanyName());
        response.setAddress(company.getAddress());
        response.setEmail(company.getEmail());
        response.setBlocked(company.isBlocked());
        response.setNumber(company.getNumber());
        response.setDateTime(company.getCreateAt());

        return response;
    }

    public List<CompanyResponse> viewCompanies(List<Company> companies){

        List<CompanyResponse> responses=new ArrayList<>();
        for (Company c:companies) {
            responses.add(viewCompany(c));
            
        }
return responses;
    }
}
