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
        //assertEquals(fullGamutJob).getEmployer() instanceof Employer);
        assertEquals(fullGamutJob.getEmployer().getValue());
    }
}
