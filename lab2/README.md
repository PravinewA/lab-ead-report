# Pull-Request Workflow for Code Contribution

## _The workflow for contributing code can seem daunting at first._

The workflow for contributing code can seem daunting at first. The most important thing to remember is to follow the patterns and standards outlined by the project you are working on (as we have already discussed). The general workflow that GitHub supports is fairly simple.

1. Fork the target repo to your own account.
1. Clone the repo to your local machine.
1. Check out a new "topic branch" and make changes.
1. Push your topic branch to your fork.
1. Use the diff viewer on GitHub to create a pull request via a discussion.
1.Make any requested changes.
1. The pull request is then merged (usually into the master branch) and the topic branch is deleted from the upstream (target) repo.

![Image of pullrequest](https://github.com/PravinewA/lab-ead-report/blob/master/lab2/img/pullrequest.png)

#### Step 1: Forking

Fork the repo on GitHub.com

#### Step 2: Cloning

Clone the repo using the URL in the right sidebar

    git clone git@github.com:abcd/xyz.git

#### Step 3: Adding the Upstream Remote

Change into the cloned directory and then at this point, you can add the upstream remote

    cd abcd
    git remote add upstream git@github.com:abcd/xyz.git

#### Step 4: Checking Out a Topic Branch

However, before you make your own changes, checkout a topic branch

    git checkout -b react/dev

#### Step 5: Committing

Now, you can make your changes, and create a commit that tracks just those changes.

    git commit -am "initial commit"

#### Step 6: Pushing

Next, you'll push this topic branch to your own fork of the project.

    git push origin react/dev

#### Step 7: Creating a Pull Request
Finally, you will create a pull request. First, go to your fork of the repo. You might see a "**your recently pushed branches**", and if so, you can choose "**Compare and Pull Request**". Otherwise, you can select your branch from the dropdown, and subsequently click "**Pull Request**" or "Compare" at the top right of the repo section.


## Branching

In Git work is done on **branches**. Only one is actually required, inevitably called the **master** branch, usually representing the current public version of the target software.

![Image of branch](https://github.com/PravinewA/lab-ead-report/blob/master/lab2/img/branch.png)

Emergency changes go into a hotfix **branch** that comes from master and is merged back into master when complete and tested; no other branches are merged into master when a hotfix is in progress. Multiple hotfixes are serial. The point of a hotfix is to go immediately into production.

New work that is going to take some time is performed in a feature branch, and when complete is merged into master.

To summarize the standard branches

* Master
* Feature
* Hotfix

All new branches should be taken from master.

#### Creating a New Branch

We use git branch (branchname) in order to create a new branch

#### Switching Branches

To switch to an existing branch, you run the git checkout command. Let’s switch to the new testing branch.