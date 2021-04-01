package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long Resta(Long number1, Long number2) {
        logger.info( "Substracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long Multiplicacion(Long number1, Long number2) {
        logger.info( "Multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Double Division(Double number1, Double number2) {
        logger.info( "Dividing {} / {}", number1, number2 );
        return number1 / number2;
    }

}
