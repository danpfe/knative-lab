package examples.knative;

import io.quarkus.funqy.Context;
import io.quarkus.funqy.Funq;
import io.quarkus.funqy.knative.events.CloudEvent;
import java.util.Arrays;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class CalculatorFunction {
  private static final Logger LOG = LoggerFactory.getLogger(CalculatorFunction.class);

  @Funq
  public Calculation calculate(final SumRequest sumRequest, @Context final CloudEvent<SumRequest> event) {
    LOG.info("Received following CloudEvent: {}.", event);
    final var calculation = new Calculation();
    calculation.setSum(Arrays.stream(sumRequest.getNumbers()).sum());
    return calculation;
  }
}
