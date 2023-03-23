package com.company.controller;

import com.company.container.ComponentContainer;
import com.company.entity.ComfortEntity;
import com.company.entity.RoomEntity;
import com.company.enums.RoomType;
import com.company.service.ComfortService;
import com.company.service.RoomService;
import com.company.util.ScannerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminController {
    @Autowired
    private RoomService roomService;
    @Autowired
    private ComfortService comfortService;

    public void start() {
        boolean b = true;
        while (b) {
            menu();
            int operation = ScannerUtil.SCANNER_NUM.nextInt();
            switch (operation) {
                case 1:
                    addRoom();
                    break;
                case 2:
                    getRooms();
                    break;
                case 3:
                    deleteRoom();
                    break;
                case 4:

                    break;
                case 5:
                    findRoom();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 0:
                    b = false;
                    break;
                default:
                    b = false;
                    System.out.println("Wrong operation number");
            }
        }
    }

    public void menu() {
        System.out.println("1. Add Room");
        System.out.println("2. Rooms  ");
        System.out.println("3. Delete room");
        System.out.println("4. Update room ");
        System.out.println("5. Find room ");
        System.out.println("6. Room convenient ");
        System.out.println("7. Add convenient ");
        System.out.println("8. List convenient ");
        System.out.println("9. Delete convenient ");
        System.out.println("10. Add Employee ");
        System.out.println("11. List Employee ");
        System.out.println("12. Delete Employee ");
        System.out.println("0. Log out");
    }

    private void addRoom() {
        System.out.print("Enter room's number : ");
        int number = ScannerUtil.SCANNER_NUM.nextInt();
        System.out.print("Enter floor number : ");
        int floorNumber = ScannerUtil.SCANNER_NUM.nextInt();
        System.out.print("Enter room type : ");
        System.out.println(
                "1. General " +
                        "2. Lux " +
                        "3. Double room " +
                        "4. Family " +
                        "5. President Room ");
        int selectRoomType = ScannerUtil.SCANNER_NUM.nextInt();
        switch (selectRoomType) {
            case 1 -> {
                ComponentContainer.roomType = RoomType.GENERAL;
            }
            case 2 -> {
                ComponentContainer.roomType = RoomType.LUX;
            }
            case 3 -> {
                ComponentContainer.roomType = RoomType.DOUBLE;
            }
            case 4 -> {
                ComponentContainer.roomType = RoomType.FAMILY;
            }
            case 5 -> {
                ComponentContainer.roomType = RoomType.PRESIDENT_ROOM;
            }
            default -> {
                System.out.println("What is this Mazgi ?? ");
            }

        }
        System.out.print("Enter room's price : ");
        Double price = ScannerUtil.SCANNER_NUM.nextDouble();
        System.out.print("Enter room's area : ");
        Integer area = ScannerUtil.SCANNER_NUM.nextInt();
        ComfortEntity comfortEntity = addComfort();

        RoomEntity entity = new RoomEntity(number, floorNumber, ComponentContainer.roomType, price, area, comfortEntity);
        roomService.addRoom(entity);
    }

    private ComfortEntity addComfort() {
        ComfortEntity comfortEntity = new ComfortEntity();
        System.out.println("Is there a pool in the room? \n 1-Yes 2-No");
        byte select = ScannerUtil.SCANNER_NUM.nextByte();
        if (select == 1) {
            comfortEntity.setSwimmingPool(true);
        } else {
            comfortEntity.setSwimmingPool(false);
        }
        System.out.println("Is there a sauna in the room? \n 1-Yes 2-No");
        select = ScannerUtil.SCANNER_NUM.nextByte();
        if (select == 1) {
            comfortEntity.setSauna(true);
        } else {
            comfortEntity.setSauna(false);
        }
        System.out.println("Is there a karaoke in the room? \n 1-Yes 2-No");
        select = ScannerUtil.SCANNER_NUM.nextByte();
        if (select == 1) {
            comfortEntity.setKaraoke(true);
        } else {
            comfortEntity.setKaraoke(false);
        }
        System.out.println("Is there a mini bar in the room? \n 1-Yes 2-No");
        select = ScannerUtil.SCANNER_NUM.nextByte();
        if (select == 1) {
            comfortEntity.setMiniBar(true);
        } else {
            comfortEntity.setMiniBar(false);
        }
        System.out.println("Is there a TV in the room? \n 1-Yes 2-No");
        select = ScannerUtil.SCANNER_NUM.nextByte();
        if (select == 1) {
            comfortEntity.setTv(true);
        } else {
            comfortEntity.setTv(false);
        }
        System.out.println("Is there a air conditioner in the room? \n 1-Yes 2-No");
        select = ScannerUtil.SCANNER_NUM.nextByte();
        if (select == 1) {
            comfortEntity.setAirConditioner(true);
        } else {
            comfortEntity.setAirConditioner(false);
        }
        comfortService.addComfort(comfortEntity);
        return comfortEntity;
    }

    private void getRooms() {
        roomService.getRooms();
    }

    private void deleteRoom() {
        System.out.println("Enter room id to delete");
        Integer id = ScannerUtil.SCANNER_NUM.nextInt();
        roomService.deleteRoom(id);
    }

    private void findRoom() {
        System.out.println("Enter room id to find");
        Integer id = ScannerUtil.SCANNER_NUM.nextInt();
        roomService.find(id);
    }


}
