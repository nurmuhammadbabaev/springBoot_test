package peaksoft.springboot_test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.springboot_test.dto.CompanyRequest;
import peaksoft.springboot_test.dto.CompanyResponse;
import peaksoft.springboot_test.entity.Company;
import peaksoft.springboot_test.mapper.CompanyEditMapper;
import peaksoft.springboot_test.mapper.CompanyViewMapper;
import peaksoft.springboot_test.repository.CompanyRepository;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyViewMapper viewMapper;
    private final CompanyRepository repository;
    private final CompanyEditMapper editMapper;


    public CompanyResponse create(CompanyRequest companyRequest){
        return viewMapper.viewCompany(repository.
                save(editMapper.create(companyRequest)));
    }

    public CompanyResponse update(Long id,CompanyRequest companyRequest){

        Company company=repository.findById(id).get();
        editMapper.update(company,companyRequest);

        return viewMapper.viewCompany(repository.save(company));

    }
    public  CompanyResponse getCompany(long id){
        return viewMapper.viewCompany(repository.findById(id).get());
    }
    public CompanyResponse deleteById(long id){
        Company company=repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewCompany(company);
    }
}
