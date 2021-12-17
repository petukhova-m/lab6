package zkanonymizer;

import org.apache.zookeeper.CreateMode;

import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import scala.Int;

import java.io.IOException;
import java.util.ArrayList;





public class ZkAnonymizerApp {

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        serverNodes = new ArrayList<>();


