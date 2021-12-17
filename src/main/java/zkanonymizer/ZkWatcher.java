





import org.apache.zookeeper.Watcher.Event.*;



import java.util.Arrays;
import java.util.List;


public class ZkWatcher implements Watcher {


    private static final String SERVER_PATH = "/servers";










    public void setZk(ZooKeeper zk) {



    @Override












                    for (String name : list) {




                    e.printStackTrace();



}
