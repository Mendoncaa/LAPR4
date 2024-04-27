# Project Jobs4U

## 1. Description of the Project

Jobs4U is a company specialized in talent acquisition. The company provides recruitment services for job positions in its clients. The aim of this project is to develop, in an exploratory way, a solution that allows automating the main activities of the company. Therefore, a minimum viable product should be developed in 3 months.

The company’s clients are other companies or entities that need to recruit human resources. In response to requests from its clients, Jobs4U develops all activities that allow it to select a set of candidates for job offers (from its clients). At the end of the process, Jobs4U must deliver to its client an ordered list of candidates for each job offer. The final recruitment decision is the responsibility of the client.

## 2. Planning and Technical Documentation

[Planning and Technical Documentation](docs/readme.md)

## 3. How to Build


Make sure Maven is installed and on the PATH


### Windows


```bash
cd scripts;
.\build.bat
```

### UNIX (MacOS and Linux)

```shell
cd scripts;
./build.sh
```


## 4. How to Execute Tests

We don't have any tests for now


## 5. How to Run

Make sure a JRE is installed and on the PATH


### Windows


```bash
.\run.bat
```

### UNIX (MacOS and Linux)

```shell
./run-backoffice.sh
```



## 6. How to Install/Deploy into Another Machine (or Virtual Machine)


1. **Prepare the Environment:**
    - Ensure that the target machine or virtual machine meets the necessary system requirements for running our application, including compatible operating system and sufficient resources (CPU, memory, disk space).

2. **Transfer Application Files:**
    - Transfer the application files from the development environment to the target machine. This can be done by creating a package (e.g., ZIP...) and transferring it.

3. **Install Dependencies:**
    - Install any dependencies required by our application on the target machine (runtime environments).

4. **Configure Environment Variables:**
    - Ensure that these variables are properly configured for the target environment.

5. **Build and Deploy:**
    - Follow the build instructions provided in our application's documentation.
    - Deploy the application to the target machine by executing deployment scripts. 

6. **Start the Application:**
    - Once the application is deployed, start the application process or service on the target machine.

7. **Verify Installation:**
    - Verify that our application is running correctly on the target machine by accessing it through a web browser or using command-line tools. Perform basic functionality tests to ensure that the application behaves as expected.


## 7. How to Generate PlantUML Diagrams

To generate plantuml diagrams for documentation execute the script (for the moment, only for linux/unix/macos):

    ./generate-plantuml-diagrams.sh


