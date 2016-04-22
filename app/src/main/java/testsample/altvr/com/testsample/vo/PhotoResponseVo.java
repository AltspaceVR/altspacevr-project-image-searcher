package testsample.altvr.com.testsample.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhotoResponseVo {
    public int total;
    public int totalHits;
    public List<PhotoVo> hits;
}
