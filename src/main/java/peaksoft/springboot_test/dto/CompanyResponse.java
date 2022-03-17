package peaksoft.springboot_test.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class CompanyResponse {
@NotNull
    private String id;
    private String companyName;
    private String address;
    private String email;
    private String number;
    private boolean blocked;
    private LocalDateTime dateTime;

}
