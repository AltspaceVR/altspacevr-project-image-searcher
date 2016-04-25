package testsample.altvr.com.testsample.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhotoVo {
    public String id;
    public String pageURL;
    public String type;
    public String tags;
    public String previewURL;
    public int previewWidth;
    public int previewHeight;
    public String webformatURL;
    public int webformatWidth;
    public int webformatHeight;
    public int imageWidth;
    public int imageHeight;
    public int views;
    public int downloads;
    public int favorites;
    public int likes;
    public int comments;
    public int user_id;
    public String user;
    public String userImageURL;
}
