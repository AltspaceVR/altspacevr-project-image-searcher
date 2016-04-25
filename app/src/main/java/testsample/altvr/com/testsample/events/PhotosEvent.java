package testsample.altvr.com.testsample.events;

import java.util.List;

import testsample.altvr.com.testsample.vo.PhotoVo;

public class PhotosEvent {
    public List<PhotoVo> data;
    public PhotosEvent(List<PhotoVo> data) { this.data = data; }
}
