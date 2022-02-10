package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.naming.Name;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){

        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence")); {


            assertTrue(job.getName() instanceof String);
            assertEquals("Product tester", job.getName());

            assertTrue(job.getEmployer() instanceof Employer);
            assertEquals("ACME", job.getEmployer().getValue());

            assertTrue(job.getLocation() instanceof Location);
            assertEquals("Desert", job.getLocation().getValue());

            assertTrue(job.getPositionType() instanceof PositionType);
            assertEquals("Quality Control", job.getPositionType().getValue());

            assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
            assertEquals("Persistence", job.getCoreCompetency().getValue());
        }
    }
    @Test
    public void testJobsForEquality(){
        Job cashier1 = new Job("Cashier", new Employer("Wendy's"), new Location("Charlotte"), new PositionType("Manager"), new CoreCompetency("Kindness"));
        Job cashier2 = new Job("Cashier", new Employer("Wendy's"), new Location("Charlotte"), new PositionType("Manager"), new CoreCompetency("Kindness"));{
            if (cashier1.equals(cashier2)){
                System.out.println("False");
            };
        }
    }
}

