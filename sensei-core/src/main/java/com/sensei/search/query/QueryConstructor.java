package com.sensei.search.query;

import org.apache.lucene.search.Query;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class QueryConstructor {
	abstract public Query constructQuery(JSONObject params) throws JSONException;
	
	public class TermQueryConstructor extends QueryConstructor{

		@Override
		public Query constructQuery(JSONObject params) {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
