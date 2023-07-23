package com.geekster.Rooms_Model.Repository;

import com.geekster.Rooms_Model.Model.Room;
import com.geekster.Rooms_Model.Model.RoomType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepo extends CrudRepository<Room,Long> {


    List<Room> findByRoomType(RoomType roomType);

    List<Room> findByRoomTypeAndRoomAvailableStatus(RoomType roomType, boolean b);
}
