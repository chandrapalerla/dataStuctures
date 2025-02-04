package com.datastructure.greedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitiySelection {

	public static void activitySelection(ArrayList<Activity> activityList) {

		Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {

			@Override
			public int compare(Activity o1, Activity o2) {
				// TODO Auto-generated method stub
				return o1.getFinishTime() - o2.getFinishTime();
			}
		};

		Collections.sort(activityList, finishTimeComparator);
		Activity previousActivity = activityList.get(0);

		// Print first job
		System.out.println("\n\nRecommended Schedule:\n" + activityList.get(0));
		for (int i = 1; i < activityList.size(); i++) {
			Activity activity = activityList.get(i);
			// if job's start time is greater than equal previous job's finish time then
			// print job
			if (activity.getStartTime() >= previousActivity.getFinishTime()) {
				System.out.println(activity);
				previousActivity = activity;
			}
		} // end of loop
	}

}
