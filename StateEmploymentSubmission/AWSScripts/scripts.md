This file contains the various command lines needed to perform the requested AWS operations.

There is a substantial amount of work not shown here that would have to be performed prior to being able to perform any of the requested operations, which at a minimum would include all the following:
- The installation of the AWS CLI
- Configuring the Authentication and Authorization for the AWS CLI installation 
- Creation of the various services being used (and their corresponding ARNs)
- Creation of one or more IAM profiles having the permissions required to perform each of requested AWS CLI operations
- Creation and assignment of security policies across the various services involved in the various AWS CLI requests

It is also very common to have to retrieve the ARNs of desired services prior to being able to request additional information regarding those services 

It is also my personal recommendation that the AWS CLI not be used from shell scripts for the purpose of automation - either of the following options are a better choice:
- Python and the AWS python libraries
- Java and the CDK

That being said, following are the basic commands that would retrieve the desired information.

-AWS CLI scripts to query secrets in secret manager
```
aws secretsmanager get-secret-value \
    --secret-id MyTestSecret
```

-AWS CLI script to retrieve running ECS Task 

```
aws ecs run-task --cluster $CLUSTER_NAME --launch-type EXTERNAL --task-definition nginx
aws ecs describe-tasks --cluster $CLUSTER_NAME --tasks $TEST_TASKID

```

-AWS CLI script to retrieve latest Task Definition 
```
aws ecs describe-task-definition --task-definition hello_world
```

-AWS CLI script to start / stop ECS service 
```
aws ecs start-task \
    --task-definition sleep360 \
    --container-instances 765936fadbdd46b5991a4bd70c2a43d4
```
You must perform another AWS command here to retrieve the task id 
```
aws ecs stop-task \
    --task 666fdccc2e2d4b6894dd422f4eeee8f8
```

-AWS CLI script to query the latest stream in a CloudWatch Log Group 
```
aws logs get-log-events --log-group-name my-logs --log-stream-name 20150601
```

