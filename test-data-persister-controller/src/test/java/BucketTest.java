import com.testinium.testdatapersister.TestDataPersisterApiApp;
import com.testinium.testdatapersister.core.repository.TestDataRepo;
import com.testinium.testdatapersister.core.service.BucketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by erdoganonur
 * on 23.05.2018.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataPersisterApiApp.class)
public class BucketTest {

    @Autowired
    private BucketService bucketService;

    @Autowired
    private TestDataRepo testDataRepo;

    @Test
    public void bucketListTest(){

        Pageable pageable = new PageRequest(1, 100);

//        Page<String> bucketPage = bucketService.getAllBuckets("new-bucket", pageable);

//        List<String> bucketList = bucketPage.getContent();

        Page<String> bucketList = bucketService.getAllBuckets(pageable);

        for(String s : bucketList){
            System.out.println(s);
        }
    }
}
