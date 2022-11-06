package behavioral.mediator_pattern;

import behavioral.mediator_pattern.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
