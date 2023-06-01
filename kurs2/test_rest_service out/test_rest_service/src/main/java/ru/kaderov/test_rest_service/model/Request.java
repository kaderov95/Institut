package ru.kaderov.test_rest_service.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
// import javax.validation.contraints.Size;
// import javax.validation.contraints.NotBlank;
// import javax.validation.contraints.Max;
import java.awt.print.PrinterGraphics;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Request {

    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;

    private String systemName;

    @NotBlank
    private String systemTime;

    private String source;

    private Integer communicationId;
    private Integer templateId;

    @Max(7)
    private Integer productCode;

    @Max(5)
    private Integer smsCode;

}
