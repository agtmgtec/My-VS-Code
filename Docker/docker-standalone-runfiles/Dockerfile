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
