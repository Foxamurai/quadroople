package dto;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Point_to_route {
    double Route_id;
    int Map_point_id;

    public static ArrayList<Point_to_route> points2Route = createPoints2RouteMok();

    public static ArrayList<Point_to_route> getPoints2Route(){
        return points2Route;
    }

    public static ArrayList<Point_to_route> createPoints2RouteMok() {
        ArrayList<Point_to_route> point_to_routes = new ArrayList<>();
        point_to_routes.add(new Point_to_route(1, 1));
        point_to_routes.add(new Point_to_route(1, 2));
        point_to_routes.add(new Point_to_route(1, 3));
        point_to_routes.add(new Point_to_route(2, 4));
        point_to_routes.add(new Point_to_route(2, 5));
        point_to_routes.add(new Point_to_route(2, 6));

        return point_to_routes;
    }

    public static ArrayList<Integer> getPoints2Route(int route_id) {
        ArrayList<Point_to_route> point_to_routes = Point_to_route.points2Route;
        ArrayList<Integer> output = new ArrayList<>();
        for (Point_to_route point : point_to_routes) {
            if (point.getRoute_id() == route_id){
                output.add(point.getMap_point_id());
            }
        }

        return output;
    }

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
