package dto;

public class Map_point {
    int Id;
    String Name;
    String Description;
    String PathToImg;
    double Longitude;
    double Latitude;

    public Map_point(int id, String name, String description, String pathToImg, double longitude, double latitude) {
        Id = id;
        Name = name;
        Description = description;
        PathToImg = pathToImg;
        Longitude = longitude;
        Latitude = latitude;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPathToImg() {
        return PathToImg;
    }

    public void setPathToImg(String pathToImg) {
        PathToImg = pathToImg;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }
}
