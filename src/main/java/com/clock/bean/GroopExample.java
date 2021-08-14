package com.clock.bean;

import java.util.ArrayList;
import java.util.List;

public class GroopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroopExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andClocktypeIsNull() {
            addCriterion("clocktype is null");
            return (Criteria) this;
        }

        public Criteria andClocktypeIsNotNull() {
            addCriterion("clocktype is not null");
            return (Criteria) this;
        }

        public Criteria andClocktypeEqualTo(String value) {
            addCriterion("clocktype =", value, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeNotEqualTo(String value) {
            addCriterion("clocktype <>", value, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeGreaterThan(String value) {
            addCriterion("clocktype >", value, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeGreaterThanOrEqualTo(String value) {
            addCriterion("clocktype >=", value, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeLessThan(String value) {
            addCriterion("clocktype <", value, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeLessThanOrEqualTo(String value) {
            addCriterion("clocktype <=", value, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeLike(String value) {
            addCriterion("clocktype like", value, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeNotLike(String value) {
            addCriterion("clocktype not like", value, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeIn(List<String> values) {
            addCriterion("clocktype in", values, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeNotIn(List<String> values) {
            addCriterion("clocktype not in", values, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeBetween(String value1, String value2) {
            addCriterion("clocktype between", value1, value2, "clocktype");
            return (Criteria) this;
        }

        public Criteria andClocktypeNotBetween(String value1, String value2) {
            addCriterion("clocktype not between", value1, value2, "clocktype");
            return (Criteria) this;
        }

        public Criteria andGnumIsNull() {
            addCriterion("gnum is null");
            return (Criteria) this;
        }

        public Criteria andGnumIsNotNull() {
            addCriterion("gnum is not null");
            return (Criteria) this;
        }

        public Criteria andGnumEqualTo(Integer value) {
            addCriterion("gnum =", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumNotEqualTo(Integer value) {
            addCriterion("gnum <>", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumGreaterThan(Integer value) {
            addCriterion("gnum >", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gnum >=", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumLessThan(Integer value) {
            addCriterion("gnum <", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumLessThanOrEqualTo(Integer value) {
            addCriterion("gnum <=", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumIn(List<Integer> values) {
            addCriterion("gnum in", values, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumNotIn(List<Integer> values) {
            addCriterion("gnum not in", values, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumBetween(Integer value1, Integer value2) {
            addCriterion("gnum between", value1, value2, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumNotBetween(Integer value1, Integer value2) {
            addCriterion("gnum not between", value1, value2, "gnum");
            return (Criteria) this;
        }

        public Criteria andClocknumIsNull() {
            addCriterion("clocknum is null");
            return (Criteria) this;
        }

        public Criteria andClocknumIsNotNull() {
            addCriterion("clocknum is not null");
            return (Criteria) this;
        }

        public Criteria andClocknumEqualTo(Integer value) {
            addCriterion("clocknum =", value, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumNotEqualTo(Integer value) {
            addCriterion("clocknum <>", value, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumGreaterThan(Integer value) {
            addCriterion("clocknum >", value, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clocknum >=", value, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumLessThan(Integer value) {
            addCriterion("clocknum <", value, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumLessThanOrEqualTo(Integer value) {
            addCriterion("clocknum <=", value, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumIn(List<Integer> values) {
            addCriterion("clocknum in", values, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumNotIn(List<Integer> values) {
            addCriterion("clocknum not in", values, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumBetween(Integer value1, Integer value2) {
            addCriterion("clocknum between", value1, value2, "clocknum");
            return (Criteria) this;
        }

        public Criteria andClocknumNotBetween(Integer value1, Integer value2) {
            addCriterion("clocknum not between", value1, value2, "clocknum");
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