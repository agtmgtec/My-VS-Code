FROM groovy:latest

# Switch to root user for package installation
USER root

# Update and install additional utilities
RUN apt update && apt install -y \
    nano vim curl wget git unzip \
    && rm -rf /var/lib/apt/lists/*

# Set back to default user
USER groovy

# Set working directory inside container
WORKDIR /scripts

# Default command to open a shell
CMD ["/bin/bash"]

#docker run -dit --name groovy_scripting -v $(pwd)/scripts:/scripts -w /scripts groovy_custom
#Use This One:
    #docker run -dit --name groovy_scripting -v $(pwd)/scripts:/scripts -w /scripts groovy-groovy

    #To Run docker container in detached mode
    #docker exec -it groovy_scripting bash


FROM groovy:latest

USER root
    
RUN apt update && apt install -y nano vim curl wget git unzip \
        && rm -rf /var/lib/apt/lists/*
    
# Ensure the groovy user owns the scripts directory
RUN mkdir -p /scripts && chown groovy:groovy /scripts
    
USER groovy
    
WORKDIR /scripts
    
CMD ["/bin/bash"]
    
#docker build -t groovy_custom .

#docker run -it --rm --name groovy_scripting -v $(pwd)/scripts:/scripts -w /scripts groovy_custom
