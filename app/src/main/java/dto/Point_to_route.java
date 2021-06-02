package dto;

public class Point_to_route {
    double Route_id;
    int Map_point_id;

    public Point_to_route(double route_id, int map_point_id) {
        Route_id = route_id;
        Map_point_id = map_point_id;
    }

    public double getRoute_id() {
        return Route_id;
    }

    public void setRoute_id(double route_id) {
        Route_id = route_id;
    }

    public int getMap_point_id() {
        return Map_point_id;
    }

    public void setMap_point_id(int map_point_id) {
        Map_point_id = map_point_id;
    }
}
