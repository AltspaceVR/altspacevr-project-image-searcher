package testsample.altvr.com.testsample.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiErrorVo {

    public String error;
    public HashMap<String, String[]> errors;

}
