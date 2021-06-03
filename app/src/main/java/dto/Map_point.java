package dto;

import java.util.ArrayList;

public class Map_point {

    private static int IdCounter = 6;

    public static ArrayList<Map_point> map_points = createMapPointsMok();

    int Id;
    String Name;
    String Description;
    String PathToImg;
    double Longitude;
    double Latitude;

    public static ArrayList<Map_point> createMapPointsMok() {
        ArrayList<Map_point> map_points = new ArrayList<>();
        map_points.add(new Map_point(1,"Астраханский кремль","историко-архитектурный комплекс","no", 46.349180 , 48.032032));
        map_points.add(new Map_point(2,"Братский садик","Парк","no",46.350218,48.035052));
        map_points.add(new Map_point(3,"Памятник Петру","Набережная","no",46.347231,48.015965));
        map_points.add(new Map_point(4,"Кристалл","Закажите венские вафли!","no",46.352124, 48.034007 ));
        map_points.add(new Map_point(5,"Розмарин", "Попробуйте лавандовый раф!","no",46.351797,48.035285 ));
        map_points.add(new Map_point(6,"Сойка","Приятная кофейня!","no",46.354103,48.034863));

        return map_points;
    }

    public static ArrayList<Map_point> map_points() {
        return map_points;
    }

    public static ArrayList<Map_point> getMapPoints(ArrayList<Integer> mapPointsIdList){
        ArrayList<Map_point> mapPoints = new ArrayList<>();
        for (int pointId: mapPointsIdList) {
            for (Map_point map_point: map_points()) {
                if (map_point.getId() == pointId){
                    mapPoints.add(map_point);

                }
            }
        }

        return mapPoints;
    }

    public Map_point(int id, String name, String description, String pathToImg, double latitude, double longitude) {
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
