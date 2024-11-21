package FileUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = FileUtils.readLines("/home/marosandor/Workspace/Prog-2/labor/src/main/java/Labor5/FileUtils/input3.txt");
        System.out.println(list.size());
        List<RollerCoaster> rcs = new ArrayList<>();

        for (String sor : list) {

            String[] splitted = sor.split(";");
            String name = splitted[0];
            String v = splitted[1];

            RollerCoaster rc = new RollerCoaster(name, v, Integer.parseInt(splitted[2]), Integer.parseInt(splitted[3]));

            rcs.add(rc);

        }

        for (int i = 0; i < rcs.size() - 1; i++)
            for (int j = i + 1; j < rcs.size(); j++) {

                if (rcs.get(i).getTime() > rcs.get(j).getTime()) {

                    RollerCoaster tmp = rcs.get(i);
                    rcs.set(i, rcs.get(j));
                    rcs.set(j, tmp);

                }
                System.out.println("Utana" + rcs);

            }

        for (RollerCoaster i : rcs)
            System.out.println(i);
    }
}
