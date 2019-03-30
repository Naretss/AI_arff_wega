import java.io.BufferedReader;
import java.io.FileReader;

import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;
//train = new Instances(new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\AI\\attribute.arff")));
// test = new Instances(new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\AI\\attribute_test.arff")));

public class WekaTest {

    public static void main(String[] args) throws Exception {

            Classifier j48tree = new J48();
            Instances train = new Instances(new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\AI\\test\\diabetes.arff")));
            int lastIndex = train.numAttributes() - 1; 
           
            train.setClassIndex(lastIndex); // การกําหนด Class Label
            
            Instances test = new Instances(new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\AI\\test\\diabetes-test.arff")));
            test.setClassIndex(lastIndex); // การกําหนด Class Label
           
            j48tree.buildClassifier(train);  // ทําหนาที่สรางโมเดล
            
            for(int i=0; i<test.numInstances(); i++) {
            
                    double index = j48tree.classifyInstance(test.instance(i)); //จัดกลุ่มตัวอย่าง
                    String className = train.attribute(lastIndex).value((int)index);
                    System.out.println(test.instance(i));
                    System.out.println(className);
                    
            }
    }
}
