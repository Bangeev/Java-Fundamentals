package ObjectAndClassesLab.Songs;

public class Song {

    private String typeList;
    private String name;
    private String time;


    public Song() {

    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return this.name;
    }
    public String getTypeList(){
        return this.typeList;
    }

    public String getTime() {
        return this.time;
    }
}
