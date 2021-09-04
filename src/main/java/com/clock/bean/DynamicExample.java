package com.clock.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andDtimeIsNull() {
            addCriterion("dTime is null");
            return (Criteria) this;
        }

        public Criteria andDtimeIsNotNull() {
            addCriterion("dTime is not null");
            return (Criteria) this;
        }

        public Criteria andDtimeEqualTo(Date value) {
            addCriterion("dTime =", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotEqualTo(Date value) {
            addCriterion("dTime <>", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeGreaterThan(Date value) {
            addCriterion("dTime >", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dTime >=", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeLessThan(Date value) {
            addCriterion("dTime <", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeLessThanOrEqualTo(Date value) {
            addCriterion("dTime <=", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeIn(List<Date> values) {
            addCriterion("dTime in", values, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotIn(List<Date> values) {
            addCriterion("dTime not in", values, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeBetween(Date value1, Date value2) {
            addCriterion("dTime between", value1, value2, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotBetween(Date value1, Date value2) {
            addCriterion("dTime not between", value1, value2, "dtime");
            return (Criteria) this;
        }

        public Criteria andSupportIsNull() {
            addCriterion("support is null");
            return (Criteria) this;
        }

        public Criteria andSupportIsNotNull() {
            addCriterion("support is not null");
            return (Criteria) this;
        }

        public Criteria andSupportEqualTo(Integer value) {
            addCriterion("support =", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotEqualTo(Integer value) {
            addCriterion("support <>", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportGreaterThan(Integer value) {
            addCriterion("support >", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportGreaterThanOrEqualTo(Integer value) {
            addCriterion("support >=", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLessThan(Integer value) {
            addCriterion("support <", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLessThanOrEqualTo(Integer value) {
            addCriterion("support <=", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportIn(List<Integer> values) {
            addCriterion("support in", values, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotIn(List<Integer> values) {
            addCriterion("support not in", values, "support");
            return (Criteria) this;
        }

        public Criteria andSupportBetween(Integer value1, Integer value2) {
            addCriterion("support between", value1, value2, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotBetween(Integer value1, Integer value2) {
            addCriterion("support not between", value1, value2, "support");
            return (Criteria) this;
        }

        public Criteria andDreplycountIsNull() {
            addCriterion("dReplyCount is null");
            return (Criteria) this;
        }

        public Criteria andDreplycountIsNotNull() {
            addCriterion("dReplyCount is not null");
            return (Criteria) this;
        }

        public Criteria andDreplycountEqualTo(Integer value) {
            addCriterion("dReplyCount =", value, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountNotEqualTo(Integer value) {
            addCriterion("dReplyCount <>", value, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountGreaterThan(Integer value) {
            addCriterion("dReplyCount >", value, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dReplyCount >=", value, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountLessThan(Integer value) {
            addCriterion("dReplyCount <", value, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountLessThanOrEqualTo(Integer value) {
            addCriterion("dReplyCount <=", value, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountIn(List<Integer> values) {
            addCriterion("dReplyCount in", values, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountNotIn(List<Integer> values) {
            addCriterion("dReplyCount not in", values, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountBetween(Integer value1, Integer value2) {
            addCriterion("dReplyCount between", value1, value2, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDreplycountNotBetween(Integer value1, Integer value2) {
            addCriterion("dReplyCount not between", value1, value2, "dreplycount");
            return (Criteria) this;
        }

        public Criteria andDimgIsNull() {
            addCriterion("dimg is null");
            return (Criteria) this;
        }

        public Criteria andDimgIsNotNull() {
            addCriterion("dimg is not null");
            return (Criteria) this;
        }

        public Criteria andDimgEqualTo(String value) {
            addCriterion("dimg =", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgNotEqualTo(String value) {
            addCriterion("dimg <>", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgGreaterThan(String value) {
            addCriterion("dimg >", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgGreaterThanOrEqualTo(String value) {
            addCriterion("dimg >=", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgLessThan(String value) {
            addCriterion("dimg <", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgLessThanOrEqualTo(String value) {
            addCriterion("dimg <=", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgLike(String value) {
            addCriterion("dimg like", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgNotLike(String value) {
            addCriterion("dimg not like", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgIn(List<String> values) {
            addCriterion("dimg in", values, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgNotIn(List<String> values) {
            addCriterion("dimg not in", values, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgBetween(String value1, String value2) {
            addCriterion("dimg between", value1, value2, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgNotBetween(String value1, String value2) {
            addCriterion("dimg not between", value1, value2, "dimg");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}