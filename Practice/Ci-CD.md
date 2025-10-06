# Devops

>Devops = Development + Operations

It is a software development and IT operations approach which aims at shorting the development lifecycle
and delvering features, fixes frequently. 

## Goals of Devops

- Faster delivery
- Increased collaboration
- Automation of repetitive tasks
- Continous Improvement

## Principles of Devops

- End to End responsibility
- Automation
- Continous Improvement
- Collaboration and Communication
- Customer centric

## Devops Culture

- Shared responsibility for delivery and quality
- Blameless post analysis after failures
- Tranparency

## Key Concepts

- CI/CD (Continous Integration & Continous Delivery/Deployment)
- Infrastructure as Code (Terraform)
- Monitoring and Logging
- Version Control
- Microservice Architecture
- DevSecOps


## CI/CD

### Key Aspects

#### Continous Integration

Developers frequently integrate the changes into a shared repository. This will trigger automatic builds.

#### Continous Delivery

Ensures that application is always in a deliverable state.

#### Continous Deployment

Directly deploy the application once the test and quality gates are cleared.

### CI/CD pipelines

It is an automated series of jobs that will
- integrate the changes
- Test for quality
- Build the application
- Deploy the application

>Git Commit -> Test -> Build -> Package -> Deploy -> Monitor