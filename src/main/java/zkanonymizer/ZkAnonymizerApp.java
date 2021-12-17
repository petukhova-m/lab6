package zkanonymizer;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;

import scala.Int;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

public class ZkAnonymizerApp {
    private static List<ServerNode> serverNodes;
    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        serverNodes = new ArrayList<>();
    }
}
