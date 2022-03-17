package peaksoft.springboot_test.dto;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CompanyRequest {
    @NotNull
    private String companyName;
    private String address;
    private String email;
    private String number;



}
