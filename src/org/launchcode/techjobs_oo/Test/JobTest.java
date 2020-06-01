package org.launchcode.techjobs_oo.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {


    @Test
    public void testSettingJobId(){
        Object firstJob = new Job();
        Object secondJob = new Job();
        assertFalse(firstJob.equals(secondJob));
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job fullGamutJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(5, fullGamutJob.getId());
        //assertTrue(fullGamutJob.getId() instanceof Id);

        assertEquals("Product tester", fullGamutJob.getName());
        assertTrue(fullGamutJob.getName() != null);

        assertEquals("ACME", fullGamutJob.getEmployer().getValue());
        assertTrue(fullGamutJob.getEmployer() instanceof Employer);

        assertEquals("Desert", fullGamutJob.getLocation().getValue());
        assertTrue(fullGamutJob.getLocation() instanceof Location);

        assertEquals("Quality control", fullGamutJob.getPositionType().getValue());
        assertTrue(fullGamutJob.getPositionType() instanceof PositionType);

        assertEquals("Persistence", fullGamutJob.getCoreCompetency().getValue());
        assertTrue(fullGamutJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job firstJob = new Job("Test Name", new Employer("Test Employer"), new Location("Test Location"), new PositionType("Test Position"), new CoreCompetency("Test Comp"));
        Job secondJob = new Job("Test Name", new Employer("Test Employer"), new Location("Test Location"), new PositionType("Test Position"), new CoreCompetency("Test Comp"));

        assertFalse(firstJob.equals(secondJob));
    }

    @Test
    public void firstTestForToString(){
        Job thisJob = new Job("Test Name", new Employer("Test Employer"), new Location("Test Location"), new PositionType("Test Position"), new CoreCompetency("Test Comp"));

        assertEquals(
                "\n" +
                "ID: " + thisJob.getId() + "\n" +
                "Name: " + thisJob.getName() + "\n" +
                "Employer: " + thisJob.getEmployer() + "\n" +
                "Location: " + thisJob.getLocation() + "\n" +
                "Position Type: " + thisJob.getPositionType() + "\n" +
                "Core Competency: " + thisJob.getCoreCompetency() + "\n" +
                "\n", thisJob.toString());
    }

    @Test
    public void secondForToString(){
        Job thisJob = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        assertEquals(
                "\n" +
                "ID: " + thisJob.getId() + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Data not available" + "\n" +
                "\n", thisJob.toString());

    }

//    @Test
//    public void onlyIdForToString(){
//        Job thisJob = new Job();
//        assertEquals("OOPS! This job does not seem to exist.",thisJob.toString());
//    }

}
