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

        assertEquals(1, fullGamutJob.getId());
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



}
