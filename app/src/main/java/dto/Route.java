package dto;

public class Route {

    int Id;
    String Name;
    String Description;
    int Creator_id;
    int City_id;

    public static final Route[] routes ={
            new Route(1,
                    "Маршрут по досотпримечательностям",
                    "Самые красивые достопримечательности Астрахани",
                    1,
                    1),
            new Route(2,
                    "Кофе трип",
                    "Лучший кофе в городе!",
                    1,
                    1)
    };

    public Route(int id, String name, String description, int creator_id, int city_id) {
        Id = id;
        Name = name;
        Description = description;
        Creator_id = creator_id;
        City_id = city_id;
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

    public int getCreator_id() {
        return Creator_id;
    }

    public void setCreator_id(int creator_id) {
        Creator_id = creator_id;
    }

    public int getCity_id() {
        return City_id;
    }

    public void setCity_id(int city_id) {
        City_id = city_id;
    }
}
