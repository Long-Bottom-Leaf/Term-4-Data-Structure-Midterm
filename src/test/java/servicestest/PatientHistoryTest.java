package servicestest;

import org.junit.jupiter.api.Test;
import model.PatientRecord;
import services.PatientHistory;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class PatientHistoryTest {

    @Test
    void testAddRecords() {
        PatientHistory history = new PatientHistory();

        history.addRecord(new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 2, 1), "Cold", "Medication"));

        assertEquals(2, history.size());
    }

    @Test
    void testNavigation() {
        PatientHistory history = new PatientHistory();

        PatientRecord r1 = new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest");
        PatientRecord r2 = new PatientRecord(LocalDate.of(2026, 2, 1), "Cold", "Medication");
        PatientRecord r3 = new PatientRecord(LocalDate.of(2026, 3, 1), "Injury", "Therapy");

        history.addRecord(r1);
        history.addRecord(r2);
        history.addRecord(r3);

        history.getOldest();

        assertEquals(r2, history.nextRecord());
        assertEquals(r3, history.nextRecord());
        assertNull(history.nextRecord());

        assertEquals(r2, history.previousRecord());
    }

    @Test
    void testBoundaryProtection() {
        PatientHistory history = new PatientHistory();

        PatientRecord r1 = new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest");

        history.addRecord(r1);

        history.getOldest();

        assertNull(history.previousRecord());
        assertNull(history.nextRecord());
    }

    @Test
    void testEmptyHistoryNavigation() {
        PatientHistory history = new PatientHistory();
        assertNull(history.getCurrent());
        assertNull(history.nextRecord());
        assertNull(history.previousRecord());
    }

    @Test
    void testGetOldestAndNewest() {
        PatientHistory history = new PatientHistory();

        PatientRecord r1 = new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest");
        PatientRecord r2 = new PatientRecord(LocalDate.of(2026, 2, 1), "Cold", "Medication");

        history.addRecord(r1);
        history.addRecord(r2);

        assertEquals(r1, history.getOldest());
        assertEquals(r2, history.getNewest());
    }
}
