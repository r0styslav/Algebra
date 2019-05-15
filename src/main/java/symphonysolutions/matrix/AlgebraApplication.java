package symphonysolutions.matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import symphonysolutions.matrix.helper.MatrixUtil;

@SpringBootApplication
public class AlgebraApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlgebraApplication.class, args);
		MatrixData matrixData;
		int size = Integer.parseInt(args[0]);
		String matrixType = args[1];

		if (matrixType.toLowerCase().equals("D")) {
			MatrixUtil<Decimal> matrixUtil = new MatrixUtil<Decimal>();
			matrixData = new MatrixData(matrixUtil.generateRandomMatrix(size));
		} else if (matrixType.toLowerCase().equals("F")){
			MatrixUtil<Fraction> matrixUtil = new MatrixUtil<Fraction>();
			matrixData = new MatrixData(matrixUtil.generateRandomMatrix(size));
		} else {
			System.out.println("Incorrect matrix type");
		}



	}

}
