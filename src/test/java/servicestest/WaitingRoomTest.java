package servicestest;

import org.junit.jupiter.api.Test;
import services.WaitingRoom;
import model.Patient;

import static org.junit.jupiter.api.Assertions.*;

public class WaitingRoomTest {

    @Test
    void testFifoServiceOrder() {
        WaitingRoom room = new WaitingRoom();

        Patient p1 = new Patient(1, "Alice", "Flue");
        Patient p2 = new Patient(2, "Billy", "Stomach Pain");

        room.addPatient(p1);
        room.addPatient(p2);

        Patient served = room.serveNextPatient();

        assertEquals(p1, served);
        assertEquals(1, room.size());
    }

    @Test
    void testEmergencyInsertion() {
        WaitingRoom room = new WaitingRoom();

        Patient p1 = new Patient(1, "Alice", "Flue");
        Patient p2 = new Patient(2, "Billy", "Stomach Pain");
        Patient emergency = new Patient(30, "Jolene", "Broken Arm");

        room.addPatient(p1);
        room.addPatient(p2);

        boolean inserted = room.insertEmergencyPatient(1, emergency);

        assertTrue(inserted);
        assertEquals(emergency, room.getAllPatients().get(1));
    }

    @Test
    void testInvalidEmergencyInsertion() {
        WaitingRoom room = new WaitingRoom();
        Patient p1 = new Patient(1, "Alice", "Flue");

        boolean result = room.insertEmergencyPatient(1, p1);

        assertFalse(result);
    }
}
